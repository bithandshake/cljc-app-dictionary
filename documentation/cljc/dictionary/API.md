
# dictionary.api isomorphic namespace

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > dictionary.api

### Index

- [add-term!](#add-term)

- [add-terms!](#add-terms)

- [look-up](#look-up)

- [select-language!](#select-language)

- [translate](#translate)

### add-term!

```
@param (keyword) term-id
@param (map) term
```

```
@usage
(add-term! :my-term {:en "My term"})
```

<details>
<summary>Source code</summary>

```
(defn add-term!
  [term-id term]
  (swap! state/TERM-COLLECTION assoc term-id term))
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
@param (map) terms
```

```
@usage
(add-terms! {:my-term {:en "My term"}})
```

<details>
<summary>Source code</summary>

```
(defn add-terms!
  [terms]
  (swap! state/TERM-COLLECTION merge terms))
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
@param (keyword) term-id
@param (keyword)(opt) language-id
```

```
@example
(look-up :apple)
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
   (look-up term-id @state/SELECTED-LANGUAGE))

  ([term-id language-id]
   (get-in @state/TERM-COLLECTION [term-id language-id])))
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
@param (keyword) language-id
```

```
@usage
(language-id! :en)
```

<details>
<summary>Source code</summary>

```
(defn select-language!
  [language-id]
  (reset! state/SELECTED-LANGUAGE language-id))
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
@param (map) term
@param (keyword)(opt) language-id
```

```
@example
(translate {:en "Apple" :hu "Alma"})
=>
"Apple"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn translate
  ([term]
   (translate term @state/SELECTED-LANGUAGE))

  ([term language-id]
   (get term language-id)))
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

This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.

