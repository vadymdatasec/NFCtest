.class public Le/b/a/y/x/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/x/y0;ZLe/b/a/y/n;Le/b/a/y/x/r0;)Le/b/a/y/x/s0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/x/y0<",
            "TR;>;Z",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/r0;",
            ")",
            "Le/b/a/y/x/s0<",
            "TR;>;"
        }
    .end annotation

    .line 1
    new-instance v6, Le/b/a/y/x/s0;

    const/4 v3, 0x1

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Le/b/a/y/x/s0;-><init>(Le/b/a/y/x/y0;ZZLe/b/a/y/n;Le/b/a/y/x/r0;)V

    return-object v6
.end method
