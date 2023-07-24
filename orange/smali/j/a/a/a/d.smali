.class public Lj/a/a/a/d;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# instance fields
.field public b:Lj/a/a/a/a;


# direct methods
.method public constructor <init>(Lj/a/a/a/a;)V
    .locals 1

    const-string v0, "CameraHandlerThread"

    .line 1
    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lj/a/a/a/d;->b:Lj/a/a/a/a;

    .line 3
    invoke-virtual {p0}, Landroid/os/HandlerThread;->start()V

    return-void
.end method

.method public static synthetic a(Lj/a/a/a/d;)Lj/a/a/a/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lj/a/a/a/d;->b:Lj/a/a/a/a;

    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3
    new-instance v1, Lj/a/a/a/c;

    invoke-direct {v1, p0, p1}, Lj/a/a/a/c;-><init>(Lj/a/a/a/d;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
