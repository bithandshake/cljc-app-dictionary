
### dictionary.api

Functional documentation of the dictionary.api isomorphic namespace

---

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > dictionary.api

### Index

- [add-term!](#add-term)

- [add-terms!](#add-terms)

- [look-up](#look-up)

- [select-language!](#select-language)

- [translate](#translate)

---

### add-term!

```
@description
Adds a single term to the global dictionary or a specific dictionary.
```

```
@param (keyword)(opt) dictionary-id
Default: :global
@param (keyword) term-id
@param (map) term
```

```
@usage
(add-term! :my-term {:en "My term"})
```

```
@usage
(add-term! :my-dictionary :my-term {:en "My term"})
```

<details>
<summary>Source code</summary>

```
(defn add-term!
  ([term-id term]
   (add-term! :global term-id term))

  ([dictionary-id term-id term]
   (swap! state/TERM-COLLECTION assoc-in [dictionary-id term-id] term)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [dictionary.api :refer [add-term!]]))

(dictionary.api/add-term! ...)
(add-term!                ...)
```

</details>

---

### add-terms!

```
@description
Adds multiple terms to the global dictionary or a specific dictionary.
```

```
@param (keyword)(opt) dictionary-id
Default: :global
@param (map) terms
```

```
@usage
(add-terms! {:my-term {:en "My term"}})
```

```
@usage
(add-terms! :my-dictionary {:my-term {:en "My term"}})
```

<details>
<summary>Source code</summary>

```
(defn add-terms!
  ([terms]
   (add-terms! :global terms))

  ([dictionary-id terms]
   (swap! state/TERM-COLLECTION update dictionary-id merge terms)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [dictionary.api :refer [add-terms!]]))

(dictionary.api/add-terms! ...)
(add-terms!                ...)
```

</details>

---

### look-up

```
@description
Looks up a specific term in the global dictionary or a specific dictionary in the selected language.
```

```
@param (keyword)(opt) dictionary-id
Default: :global
@param (keyword) term-id
```

```
@example
(look-up :apple)
=>
"Alma"
```

```
@example
(look-up :my-dictionary :apple)
=>
"Alma"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn look-up
  ([term-id]
   (look-up :global term-id))

  ([dictionary-id term-id]
   (get-in @state/TERM-COLLECTION [dictionary-id term-id (dictionary-id @state/SELECTED-LANGUAGE)])))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [dictionary.api :refer [look-up]]))

(dictionary.api/look-up ...)
(look-up                ...)
```

</details>

---

### select-language!

```
@description
Sets the language of the global dictionary or a specific dictionary.
```

```
@param (keyword)(opt) dictionary-id
Default: :global
@param (keyword) language-id
```

```
@usage
(language-id! :en)
```

```
@usage
(language-id! :my-dictionary :en)
```

<details>
<summary>Source code</summary>

```
(defn select-language!
  ([language-id]
   (select-language! :global language-id))

  ([dictionary-id language-id]
   (swap! state/SELECTED-LANGUAGE assoc dictionary-id language-id)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [dictionary.api :refer [select-language!]]))

(dictionary.api/select-language! ...)
(select-language!                ...)
```

</details>

---

### translate

```
@description
Looks up a specific term in the global dictionary or a specific dictionary in the provided language.
```

```
@param (keyword)(opt) dictionary-id
Default: :global
@param (keyword) term-id
@param (keyword) language-id
```

```
@example
(translate :apple :hu)
=>
"Alma"
```

```
@example
(translate :my-dictionary :apple :hu)
=>
"Alma"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn translate
  ([term-id language-id]
   (translate :global term-id language-id))

  ([dictionary-id term-id language-id]
   (get-in @state/TERM-COLLECTION [dictionary-id term-id language-id])))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [dictionary.api :refer [translate]]))

(dictionary.api/translate ...)
(translate                ...)
```

</details>

---

<sub>This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.</sub>

