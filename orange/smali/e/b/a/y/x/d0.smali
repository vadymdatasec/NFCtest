.class public Le/b/a/y/x/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/e0/u/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/e0/u/d<",
        "Le/b/a/y/x/p<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/b/a/y/x/e0;


# direct methods
.method public constructor <init>(Le/b/a/y/x/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/x/d0;->a:Le/b/a/y/x/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Le/b/a/y/x/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/y/x/p<",
            "*>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/b/a/y/x/p;

    iget-object v1, p0, Le/b/a/y/x/d0;->a:Le/b/a/y/x/e0;

    iget-object v2, v1, Le/b/a/y/x/e0;->a:Le/b/a/y/x/r;

    iget-object v1, v1, Le/b/a/y/x/e0;->b:Lc/h/m/d;

    invoke-direct {v0, v2, v1}, Le/b/a/y/x/p;-><init>(Le/b/a/y/x/r;Lc/h/m/d;)V

    return-object v0
.end method

.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/y/x/d0;->a()Le/b/a/y/x/p;

    move-result-object v0

    return-object v0
.end method
