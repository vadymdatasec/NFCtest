.class public Lc/h/k/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public b:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TT;>;"
        }
    .end annotation
.end field

.field public c:Lc/h/m/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;Lc/h/m/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;",
            "Lc/h/m/a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/h/k/u;->b:Ljava/util/concurrent/Callable;

    .line 3
    iput-object p3, p0, Lc/h/k/u;->c:Lc/h/m/a;

    .line 4
    iput-object p1, p0, Lc/h/k/u;->d:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/h/k/u;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lc/h/k/u;->c:Lc/h/m/a;

    .line 3
    iget-object v2, p0, Lc/h/k/u;->d:Landroid/os/Handler;

    new-instance v3, Lc/h/k/t;

    invoke-direct {v3, p0, v1, v0}, Lc/h/k/t;-><init>(Lc/h/k/u;Lc/h/m/a;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
