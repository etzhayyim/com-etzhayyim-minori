#!/usr/bin/env bb
(require '[minori.score-test :as score-test])

(let [{:keys [pass total]} (score-test/run)]
  (System/exit (if (= pass total) 0 1)))
