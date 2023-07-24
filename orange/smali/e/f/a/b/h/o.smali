.class public final Le/f/a/b/h/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
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
            "TTResult;TTContinuationResult;>;"
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
            "TTResult;TTContinuationResult;>;",
            "Le/f/a/b/h/f0<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/b/h/o;->a:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Le/f/a/b/h/o;->b:Le/f/a/b/h/a;

    .line 4
    iput-object p3, p0, Le/f/a/b/h/o;->c:Le/f/a/b/h/f0;

    return-void
.end method

.method public static synthetic a(Le/f/a/b/h/o;)Le/f/a/b/h/f0;
    .locals 0

    .line 2
    iget-object p0, p0, Le/f/a/b/h/o;->c:Le/f/a/b/h/f0;

    return-object p0
.end method

.method public static synthetic b(Le/f/a/b/h/o;)Le/f/a/b/h/a;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/h/o;->b:Le/f/a/b/h/a;

    return-object p0
.end method


# virtual methods
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
    iget-object v0, p0, Le/f/a/b/h/o;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Le/f/a/b/h/p;

    invoke-direct {v1, p0, p1}, Le/f/a/b/h/p;-><init>(Le/f/a/b/h/o;Le/f/a/b/h/g;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
