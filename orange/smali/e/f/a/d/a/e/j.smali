.class public final Le/f/a/d/a/e/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Le/f/a/d/a/e/k;


# direct methods
.method public synthetic constructor <init>(Le/f/a/d/a/e/k;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/e/j;->a:Le/f/a/d/a/e/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/e/j;->a:Le/f/a/d/a/e/k;

    invoke-static {v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/k;)Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Le/f/a/d/a/e/j;->a:Le/f/a/d/a/e/k;

    new-instance v0, Le/f/a/d/a/e/h;

    invoke-direct {v0, p0, p2}, Le/f/a/d/a/e/h;-><init>(Le/f/a/d/a/e/j;Landroid/os/IBinder;)V

    invoke-static {p1, v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/k;Le/f/a/d/a/e/b;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/e/j;->a:Le/f/a/d/a/e/k;

    invoke-static {v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/k;)Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Le/f/a/d/a/e/j;->a:Le/f/a/d/a/e/k;

    new-instance v0, Le/f/a/d/a/e/i;

    invoke-direct {v0, p0}, Le/f/a/d/a/e/i;-><init>(Le/f/a/d/a/e/j;)V

    invoke-static {p1, v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/k;Le/f/a/d/a/e/b;)V

    return-void
.end method
