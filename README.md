# anjel

A Clojure client for the [AngelList API](https://angel.co/api)


## Usage

Add to your project.clj:

`[anjel "0.0.1"]`

Then:

```clojure

(require '[anjel.core :as anjel])

(anjel/find-startup "a startup")

```

Return will be `nil` if no matches are found, or a hash of the attributes of the first matching startup.

Honestly, I wouldn't use this in production yet. Work in progress.

## License

Copyright © 2013 Jason Lewis

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
