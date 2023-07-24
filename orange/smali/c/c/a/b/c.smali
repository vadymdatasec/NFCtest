.class public Lc/c/a/b/c;
.super Lc/c/a/b/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc/c/a/b/f<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lc/c/a/b/d;Lc/c/a/b/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;",
            "Lc/c/a/b/d<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lc/c/a/b/f;-><init>(Lc/c/a/b/d;Lc/c/a/b/d;)V

    return-void
.end method


# virtual methods
.method public b(Lc/c/a/b/d;)Lc/c/a/b/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;)",
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p1, Lc/c/a/b/d;->d:Lc/c/a/b/d;

    return-object p1
.end method

.method public c(Lc/c/a/b/d;)Lc/c/a/b/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;)",
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p1, Lc/c/a/b/d;->e:Lc/c/a/b/d;

    return-object p1
.end method
