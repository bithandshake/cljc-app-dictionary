
# cljc-dictionary

### Overview

The <strong>cljc-dictionary</strong> is a simple term handler for multilingual
applications and websites.

### deps.edn

```
{:deps {bithandshake/cljc-dictionary {:git/url "https://github.com/bithandshake/cljc-dictionary"
                                      :sha     "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"}}
```

### Current version

Check out the latest commit on the [release branch](https://github.com/bithandshake/cljc-dictionary/tree/release).

### Documentation

The <strong>cljc-dictionary</strong> functional documentation is [available here](documentation/COVER.md).

### Changelog

You can track the changes of the <strong>cljc-dictionary</strong> library [here](CHANGES.md).

# Usage

### Index

- [How to add a single term to the collection?](#how-to-add-a-single-term-to-the-collection)

- [How to add multiple terms to the collection?](#how-to-add-multiple-terms-to-the-collection)

- [How to set the current language?](#how-to-set-the-current-language)

- [How to get a term translated to the current language?](#how-to-get-a-term-translated-to-the-current-language)

### How to add a single term to the collection?

The [`dictionary.api/add-term!`](documentation/cljc/dictionary/API.md#add-term)
function adds a single multilingual term to the global dictionary or a specific dictionary.

```
(add-term! :apple {:en "Apple" :hu "Alma"})
```

```
(add-term! :my-dictionary :apple {:en "Apple" :hu "Alma"})
```

### How to add multiple terms to the collection?

The [`dictionary.api/add-terms!`](documentation/cljc/dictionary/API.md#add-term)
function adds one or more multilingual terms to the global dictionary or a specific dictionary.

```
(add-terms! {:apple {:en "Apple" :hu "Alma"}
             :pear  {:en "Pear"  :hu "Körte"}})
```

```
(add-terms! :my-dictionary {:apple {:en "Apple" :hu "Alma"}
                            :pear  {:en "Pear"  :hu "Körte"}})
```

### How to set the current language?

The [`dictionary.api/select-language!`](documentation/cljc/dictionary/API.md#select-language)
function sets the current language of the global dictionary or a specific dictionary.

```
(select-language! :en)
```

```
(select-language! :my-dictionary :en)
```

### How to get a term translated to the current language?

The [`dictionary.api/look-up`](documentation/cljc/dictionary/API.md#look-up)
function returns a term translated to the current language read from the global dictionary or a specific dictionary.

```
(look-up :apple)
; =>
; "Apple"
```

```
(look-up :my-dictionary :apple)
; =>
; "Apple"
```

### How to get a term translated to a specific language?

The [`dictionary.api/translate`](documentation/cljc/dictionary/API.md#translate)
function returns a term translated to a specific language read from the global dictionary or a specific dictionary.

```
(translate :apple :en)
; =>
; "Apple"
```

```
(translate :my-dictionary :apple :en)
; =>
; "Apple"
```
