.class public final Le/f/b/b/z;
.super Le/f/b/b/n;
.source "SourceFile"

# interfaces
.implements Le/f/b/b/e0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/n<",
        "TK;TV;",
        "Le/f/b/b/z<",
        "TK;TV;>;>;",
        "Le/f/b/b/e0<",
        "TK;TV;",
        "Le/f/b/b/z<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public volatile d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILe/f/b/b/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Le/f/b/b/z<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/f/b/b/n;-><init>(Ljava/lang/Object;ILe/f/b/b/r;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Le/f/b/b/z;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Le/f/b/b/z;)Le/f/b/b/z;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/z<",
            "TK;TV;>;)",
            "Le/f/b/b/z<",
            "TK;TV;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/f/b/b/z;

    iget-object v1, p0, Le/f/b/b/n;->a:Ljava/lang/Object;

    iget v2, p0, Le/f/b/b/n;->b:I

    invoke-direct {v0, v1, v2, p1}, Le/f/b/b/z;-><init>(Ljava/lang/Object;ILe/f/b/b/z;)V

    .line 3
    iget-object p1, p0, Le/f/b/b/z;->d:Ljava/lang/Object;

    iput-object p1, v0, Le/f/b/b/z;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/f/b/b/z;->d:Ljava/lang/Object;

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/z;->d:Ljava/lang/Object;

    return-object v0
.end method
