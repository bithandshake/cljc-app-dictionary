
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

### Index

- [How to add a single term to the collection?](#how-to-add-a-single-term-to-the-collection)
- [How to add multiple terms to the collection?](#how-to-add-multiple-terms-to-the-collection)
- [How to set the current language?](#how-to-set-the-current-language)
- [How to get a term translated to the current language?](#how-to-get-a-term-translated-to-the-current-language)
- [How to translate a term to the current language?](#how-to-translate-a-term-to-the-current-language)

# Usage

### How to add a single term to the collection?

The [`dictionary.api/add-term!`](documentation/cljc/dictionary/API.md#add-term)
function adds a single multilingual term to the collection.

```
(add-term! :apple {:en "Apple" :hu "Alma"})
```

### How to add multiple terms to the collection?

The [`dictionary.api/add-terms!`](documentation/cljc/dictionary/API.md#add-term)
function adds one or more multilingual terms to the collection.

```
(add-terms! {:apple {:en "Apple" :hu "Alma"}
             :pear  {:en "Pear"  :hu "Körte"}})
```

### How to set the current language?

The [`dictionary.api/select-language!`](documentation/cljc/dictionary/API.md#select-language)
function sets the current language.

```
(select-language! :en)
```

### How to get a term translated to the current language?

The [`dictionary.api/look-up`](documentation/cljc/dictionary/API.md#look-up)
function returns a term translated to the current language.

```
(look-up :apple)
=>
"Apple"
```

### How to translate a term to the current language?

The [`dictionary.api/translate`](documentation/cljc/dictionary/API.md#translate)
function translates a term to the current language.

```
(translate {:en "Apple" :hu "Alma"})
=>
"Apple"
```
