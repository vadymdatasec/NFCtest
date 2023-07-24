.class public Le/b/a/y/x/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/e0/u/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/e0/u/d<",
        "Le/b/a/y/x/k0<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/b/a/y/x/g0;


# direct methods
.method public constructor <init>(Le/b/a/y/x/g0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/x/f0;->a:Le/b/a/y/x/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Le/b/a/y/x/k0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/y/x/k0<",
            "*>;"
        }
    .end annotation

    .line 2
    new-instance v8, Le/b/a/y/x/k0;

    iget-object v0, p0, Le/b/a/y/x/f0;->a:Le/b/a/y/x/g0;

    iget-object v1, v0, Le/b/a/y/x/g0;->a:Le/b/a/y/x/h1/k;

    iget-object v2, v0, Le/b/a/y/x/g0;->b:Le/b/a/y/x/h1/k;

    iget-object v3, v0, Le/b/a/y/x/g0;->c:Le/b/a/y/x/h1/k;

    iget-object v4, v0, Le/b/a/y/x/g0;->d:Le/b/a/y/x/h1/k;

    iget-object v5, v0, Le/b/a/y/x/g0;->e:Le/b/a/y/x/o0;

    iget-object v6, v0, Le/b/a/y/x/g0;->f:Le/b/a/y/x/r0;

    iget-object v7, v0, Le/b/a/y/x/g0;->g:Lc/h/m/d;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Le/b/a/y/x/k0;-><init>(Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/o0;Le/b/a/y/x/r0;Lc/h/m/d;)V

    return-object v8
.end method

.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/y/x/f0;->a()Le/b/a/y/x/k0;

    move-result-object v0

    return-object v0
.end method
