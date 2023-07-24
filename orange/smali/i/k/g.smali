.class public abstract Li/k/g;
.super Li/k/e;
.source "SourceFile"


# direct methods
.method public static final a(Li/k/a;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/k/a<",
            "+TT;>;)",
            "Ljava/lang/Iterable<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$this$asIterable"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Li/k/f;

    invoke-direct {v0, p0}, Li/k/f;-><init>(Li/k/a;)V

    return-object v0
.end method
