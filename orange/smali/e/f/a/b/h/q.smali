.class public final Le/f/a/b/h/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/b;
.implements Le/f/a/b/h/d;
.implements Le/f/a/b/h/e;
.implements Le/f/a/b/h/c0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/f/a/b/h/b;",
        "Le/f/a/b/h/d;",
        "Le/f/a/b/h/e<",
        "TTContinuationResult;>;",
        "Le/f/a/b/h/c0<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Le/f/a/b/h/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/a<",
            "TTResult;",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;>;"
        }
    .end annotation
.end field

.field public final c:Le/f/a/b/h/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/f0<",
            "TTContinuationResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;Le/f/a/b/h/f0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/a<",
            "TTResult;",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;>;",
            "Le/f/a/b/h/f0<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/b/h/q;->a:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Le/f/a/b/h/q;->b:Le/f/a/b/h/a;

    .line 4
    iput-object p3, p0, Le/f/a/b/h/q;->c:Le/f/a/b/h/f0;

    return-void
.end method

.method public static synthetic a(Le/f/a/b/h/q;)Le/f/a/b/h/a;
    .locals 0

    .line 5
    iget-object p0, p0, Le/f/a/b/h/q;->b:Le/f/a/b/h/a;

    return-object p0
.end method

.method public static synthetic b(Le/f/a/b/h/q;)Le/f/a/b/h/f0;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/h/q;->c:Le/f/a/b/h/f0;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 4
    iget-object v0, p0, Le/f/a/b/h/q;->c:Le/f/a/b/h/f0;

    invoke-virtual {v0}, Le/f/a/b/h/f0;->f()Z

    return-void
.end method

.method public final a(Le/f/a/b/h/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/h/g<",
            "TTResult;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/b/h/q;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Le/f/a/b/h/r;

    invoke-direct {v1, p0, p1}, Le/f/a/b/h/r;-><init>(Le/f/a/b/h/q;Le/f/a/b/h/g;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 1

    .line 3
    iget-object v0, p0, Le/f/a/b/h/q;->c:Le/f/a/b/h/f0;

    invoke-virtual {v0, p1}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/a/b/h/q;->c:Le/f/a/b/h/f0;

    invoke-virtual {v0, p1}, Le/f/a/b/h/f0;->a(Ljava/lang/Object;)V

    return-void
.end method
