.class public Lcom/google/android/material/theme/MaterialComponentsViewInflater;
.super Landroidx/appcompat/app/AppCompatViewInflater;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    return-void
.end method


# virtual methods
.method public createButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/n;
    .locals 1

    .line 1
    new-instance v0, Le/f/a/c/m/a;

    invoke-direct {v0, p1, p2}, Le/f/a/c/m/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method
