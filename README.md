# lein-interactive

A Leiningen plugin to do many wonderful things.

## Usage

FIXME: Use this for user-level plugins:

Put `[lein-interactive "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
lein-interactive 0.1.0-SNAPSHOT`.

FIXME: Use this for project-level plugins:

Put `[lein-interactive "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

FIXME: and add an example usage that actually makes sense:

    $ lein interactive

## Known issues

* `check` stops the process because leiningen's check.clj has `System/exit` call..

## License

Copyright (c) 2013-2015 Tatsuhiro Ujihisa

GPL 3 or any later version with exception clause to allow you to re-distribute with clojure or leiningen (or of course both.)
