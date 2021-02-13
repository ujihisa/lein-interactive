# lein-interactive

A Leiningen plugin to do many wonderful things.

## Usage

FIXME: Use this for user-level plugins:

Put `[io.github.ujihisa/lein-interactive "1.0.0"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
lein-interactive 1.0.0`.

FIXME: Use this for project-level plugins:

Put `[io.github.ujihisa/lein-interactive "1.0.0"]` into the `:plugins` vector of your project.clj.

FIXME: and add an example usage that actually makes sense:

    $ lein interactive

## License

Copyright (c) 2013 Tatsuhiro Ujihisa

GPL 3 or any later version with exception clause to allow you to re-distribute with clojure or leiningen (or of course both.)

## Development

Use docker-compose

`docker-compose up --build lein-interactive`
