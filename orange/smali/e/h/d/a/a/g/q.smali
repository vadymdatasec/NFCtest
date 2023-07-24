.class public final Le/h/d/a/a/g/q;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/h/d/a/a/g/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/g/p;-><init>(Li/h/c/g;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.nfc.action.ADAPTER_STATE_CHANGED"

    invoke-static {v1, v0}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    const-string v1, "android.nfc.extra.ADAPTER_STATE"

    .line 2
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-eq p2, v0, :cond_0

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "packid.nfc.stateChange"

    const-string v0, "State changed"

    .line 3
    invoke-static {p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {p1}, Lcom/orange/oab/contactless/packid/service/Aid;->register(Landroid/content/Context;)V

    .line 5
    sget-object p2, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    invoke-virtual {p2, p1}, Le/h/d/a/a/r/b;->g(Landroid/content/Context;)V

    :cond_1
    :goto_0
    return-void
.end method
