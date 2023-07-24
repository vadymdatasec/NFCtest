.class public Le/b/a/y/x/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/e0/u/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/e0/u/d<",
        "Le/b/a/y/x/x0<",
        "*>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Le/b/a/y/x/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/y/x/x0<",
            "*>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/b/a/y/x/x0;

    invoke-direct {v0}, Le/b/a/y/x/x0;-><init>()V

    return-object v0
.end method

.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/y/x/w0;->a()Le/b/a/y/x/x0;

    move-result-object v0

    return-object v0
.end method
