.class public Lj/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/hardware/Camera;

.field public final synthetic c:Lj/a/a/a/c;


# direct methods
.method public constructor <init>(Lj/a/a/a/c;Landroid/hardware/Camera;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/a/a/a/b;->c:Lj/a/a/a/c;

    iput-object p2, p0, Lj/a/a/a/b;->b:Landroid/hardware/Camera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj/a/a/a/b;->c:Lj/a/a/a/c;

    iget-object v0, v0, Lj/a/a/a/c;->c:Lj/a/a/a/d;

    invoke-static {v0}, Lj/a/a/a/d;->a(Lj/a/a/a/d;)Lj/a/a/a/a;

    move-result-object v0

    iget-object v1, p0, Lj/a/a/a/b;->b:Landroid/hardware/Camera;

    iget-object v2, p0, Lj/a/a/a/b;->c:Lj/a/a/a/c;

    iget v2, v2, Lj/a/a/a/c;->b:I

    invoke-static {v1, v2}, Lj/a/a/a/i;->a(Landroid/hardware/Camera;I)Lj/a/a/a/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/a/a/a/a;->setupCameraPreview(Lj/a/a/a/i;)V

    return-void
.end method
