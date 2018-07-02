object MainViewParts {

  val syncModeSwitcher =
    span(
      state.syncMode
        .map { mode =>
          span(
            title := "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            onClick
              .map(
                _ =>
                  (if (mode == SyncMode.Live) SyncMode.Local
                   else SyncMode.Live): SyncMode
              ) --> state.syncMode
          )
        }
    )

}
