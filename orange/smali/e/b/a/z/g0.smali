.class public Le/b/a/z/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/b/a/z/j0;


# direct methods
.method public constructor <init>(Le/b/a/z/j0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/z/g0;->b:Le/b/a/z/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/z/g0;->b:Le/b/a/z/j0;

    iget-boolean v0, v0, Le/b/a/z/j0;->e:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Le/b/a/z/g0;->b:Le/b/a/z/j0;

    const/4 v1, 0x0

    iput-boolean v1, v0, Le/b/a/z/j0;->e:Z

    .line 3
    iget-object v0, p0, Le/b/a/z/g0;->b:Le/b/a/z/j0;

    iget-object v1, v0, Le/b/a/z/j0;->a:Landroid/content/Context;

    iget-object v0, v0, Le/b/a/z/j0;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
