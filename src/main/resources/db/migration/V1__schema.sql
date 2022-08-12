CREATE TABLE request_group
(
    id         SERIAL PRIMARY KEY       NOT NULL,
    parent_id  INTEGER REFERENCES request_group (id),
    name       VARCHAR(255)             NOT NULL,
    status     VARCHAR(32)              NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL,
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE TABLE request_template
(
    id          SERIAL PRIMARY KEY       NOT NULL,
    url         VARCHAR(255)             NOT NULL,
    http_method VARCHAR(255)             NOT NULL,
    name        VARCHAR(255)             NOT NULL,
    body        TEXT,
    is_locked   BOOLEAN                  NOT NULL,
    group_id    INTEGER REFERENCES request_group (id),
    status      VARCHAR(32)              NOT NULL,
    created_at  TIMESTAMP WITH TIME ZONE NOT NULL,
    updated_at  TIMESTAMP WITH TIME ZONE NOT NULL
);