.class public Le/f/c/q/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:Le/f/a/b/h/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/f/a/b/h/h;

    invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V

    iput-object v0, p0, Le/f/c/q/g0;->b:Le/f/a/b/h/h;

    .line 3
    iput-object p1, p0, Le/f/c/q/g0;->a:Landroid/content/Intent;

    return-void
.end method

.method public static final synthetic a(Ljava/util/concurrent/ScheduledFuture;Le/f/a/b/h/g;)V
    .locals 0

    const/4 p1, 0x0

    .line 6
    invoke-interface {p0, p1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 5
    iget-object v0, p0, Le/f/c/q/g0;->b:Le/f/a/b/h/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 4

    .line 1
    new-instance v0, Le/f/c/q/e0;

    invoke-direct {v0, p0}, Le/f/c/q/e0;-><init>(Le/f/c/q/g0;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2328

    .line 2
    invoke-interface {p1, v0, v2, v3, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Le/f/c/q/g0;->b()Le/f/a/b/h/g;

    move-result-object v1

    new-instance v2, Le/f/c/q/f0;

    invoke-direct {v2, v0}, Le/f/c/q/f0;-><init>(Ljava/util/concurrent/ScheduledFuture;)V

    .line 4
    invoke-virtual {v1, p1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;

    return-void
.end method

.method public b()Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/q/g0;->b:Le/f/a/b/h/h;

    invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/c/q/g0;->a:Landroid/content/Intent;

    .line 2
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Service took too long to process intent: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " App may get closed."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FirebaseInstanceId"

    .line 3
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0}, Le/f/c/q/g0;->a()V

    return-void
.end method
