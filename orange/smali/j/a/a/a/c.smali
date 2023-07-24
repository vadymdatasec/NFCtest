.class public Lj/a/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj/a/a/a/d;


# direct methods
.method public constructor <init>(Lj/a/a/a/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/a/a/a/c;->c:Lj/a/a/a/d;

    iput p2, p0, Lj/a/a/a/c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget v0, p0, Lj/a/a/a/c;->b:I

    invoke-static {v0}, Lj/a/a/a/h;->a(I)Landroid/hardware/Camera;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3
    new-instance v2, Lj/a/a/a/b;

    invoke-direct {v2, p0, v0}, Lj/a/a/a/b;-><init>(Lj/a/a/a/c;Landroid/hardware/Camera;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
