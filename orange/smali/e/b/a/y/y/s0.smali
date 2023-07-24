.class public Le/b/a/y/y/s0;
.super Le/b/a/e0/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/b/a/e0/o<",
        "Le/b/a/y/y/t0<",
        "TA;>;TB;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le/b/a/y/y/u0;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Le/b/a/e0/o;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/y/t0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/t0<",
            "TA;>;TB;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/b/a/y/y/t0;->a()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Le/b/a/y/y/t0;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/y/s0;->a(Le/b/a/y/y/t0;Ljava/lang/Object;)V

    return-void
.end method
