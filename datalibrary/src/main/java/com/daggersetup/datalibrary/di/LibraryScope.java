package com.daggersetup.datalibrary.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

@Scope
@Retention(value= RetentionPolicy.RUNTIME)
@interface LibraryScope {
} 