.class public final Le/f/a/b/h/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/a/b/h/f0;

.field public final synthetic c:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Le/f/a/b/h/f0;Ljava/util/concurrent/Callable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/h/g0;->b:Le/f/a/b/h/f0;

    iput-object p2, p0, Le/f/a/b/h/g0;->c:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f/a/b/h/g0;->b:Le/f/a/b/h/f0;

    iget-object v1, p0, Le/f/a/b/h/g0;->c:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/b/h/f0;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Le/f/a/b/h/g0;->b:Le/f/a/b/h/f0;

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void
.end method
