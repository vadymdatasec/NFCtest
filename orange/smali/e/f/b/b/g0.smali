.class public final Le/f/b/b/g0;
.super Le/f/b/b/o;
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
        "Le/f/b/b/o<",
        "TK;TV;",
        "Le/f/b/b/g0<",
        "TK;TV;>;>;",
        "Le/f/b/b/e0<",
        "TK;TV;",
        "Le/f/b/b/g0<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public volatile c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILe/f/b/b/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;TK;I",
            "Le/f/b/b/g0<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Le/f/b/b/o;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILe/f/b/b/r;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Le/f/b/b/g0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/g0;)Le/f/b/b/g0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;",
            "Le/f/b/b/g0<",
            "TK;TV;>;)",
            "Le/f/b/b/g0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/f/b/b/g0;

    .line 3
    invoke-virtual {p0}, Le/f/b/b/o;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Le/f/b/b/o;->a:I

    invoke-direct {v0, p1, v1, v2, p2}, Le/f/b/b/g0;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILe/f/b/b/g0;)V

    .line 4
    iget-object p1, p0, Le/f/b/b/g0;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Le/f/b/b/g0;->a(Ljava/lang/Object;)V

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
    iput-object p1, p0, Le/f/b/b/g0;->c:Ljava/lang/Object;

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
    iget-object v0, p0, Le/f/b/b/g0;->c:Ljava/lang/Object;

    return-object v0
.end method
