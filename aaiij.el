(defun aaiij:find-range ()

""
  (if (search-forward "</div>" nil t)
    (let ((end (point)))
      (if (search-backward "<h3>" nil t)
        (cons (point) end)
        (error "Can't find the entry-beginning <h3>")))
    (error "Can't find the entry-ending </div>")))
