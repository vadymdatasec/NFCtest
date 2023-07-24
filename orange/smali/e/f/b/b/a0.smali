.class public final Le/f/b/b/a0;
.super Le/f/b/b/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/u<",
        "TK;TV;",
        "Le/f/b/b/z<",
        "TK;TV;>;",
        "Le/f/b/b/a0<",
        "TK;TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le/f/b/b/q;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/q<",
            "TK;TV;",
            "Le/f/b/b/z<",
            "TK;TV;>;",
            "Le/f/b/b/a0<",
            "TK;TV;>;>;II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/f/b/b/u;-><init>(Le/f/b/b/q;II)V

    return-void
.end method


# virtual methods
.method public i()Le/f/b/b/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/a0<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public bridge synthetic i()Le/f/b/b/u;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/b/b/a0;->i()Le/f/b/b/a0;

    return-object p0
.end method
