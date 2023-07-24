.class public final Le/f/b/b/n0;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"

# interfaces
.implements Le/f/b/b/m0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "E::",
        "Le/f/b/b/r<",
        "TK;TV;TE;>;>",
        "Ljava/lang/ref/WeakReference<",
        "TV;>;",
        "Le/f/b/b/m0<",
        "TK;TV;TE;>;"
    }
.end annotation


# instance fields
.field public final a:Le/f/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Le/f/b/b/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;TV;TE;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    iput-object p3, p0, Le/f/b/b/n0;->a:Le/f/b/b/r;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/r;)Le/f/b/b/m0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;TE;)",
            "Le/f/b/b/m0<",
            "TK;TV;TE;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/f/b/b/n0;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Le/f/b/b/n0;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Le/f/b/b/r;)V

    return-object v0
.end method

.method public a()Le/f/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/n0;->a:Le/f/b/b/r;

    return-object v0
.end method
