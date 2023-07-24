.class public Lb/a/a/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:I

.field public final c:Landroid/os/Bundle;

.field public final synthetic d:Lb/a/a/b/g;


# direct methods
.method public constructor <init>(Lb/a/a/b/g;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb/a/a/b/f;->d:Lb/a/a/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lb/a/a/b/f;->b:I

    .line 3
    iput-object p3, p0, Lb/a/a/b/f;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb/a/a/b/f;->d:Lb/a/a/b/g;

    iget v1, p0, Lb/a/a/b/f;->b:I

    iget-object v2, p0, Lb/a/a/b/f;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lb/a/a/b/g;->a(ILandroid/os/Bundle;)V

    return-void
.end method
