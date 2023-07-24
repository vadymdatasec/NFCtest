.class public final Le/f/a/b/c/l/k/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/c/l/k/a;


# instance fields
.field public final synthetic a:Le/f/a/b/c/l/k/f;


# direct methods
.method public constructor <init>(Le/f/a/b/c/l/k/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/c/l/k/p;->a:Le/f/a/b/c/l/k/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/p;->a:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/p;->a:Le/f/a/b/c/l/k/f;

    .line 2
    invoke-static {v1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
