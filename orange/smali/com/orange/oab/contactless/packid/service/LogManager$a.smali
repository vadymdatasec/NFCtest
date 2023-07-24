.class public Lcom/orange/oab/contactless/packid/service/LogManager$a;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/oab/contactless/packid/service/LogManager;->a(Landroid/content/Context;Le/h/d/a/a/w/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Le/h/d/a/a/w/n;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Le/h/d/a/a/w/n;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/service/LogManager$a;->b:Le/h/d/a/a/w/n;

    invoke-direct {p0, p1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onReceiveResult(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/os/ResultReceiver;->onReceiveResult(ILandroid/os/Bundle;)V

    const-string p1, "grant_result"

    .line 2
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    const/4 p2, 0x0

    .line 3
    aget p2, p1, p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    aget p1, p1, p2

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/LogManager$a;->b:Le/h/d/a/a/w/n;

    invoke-interface {p1}, Le/h/d/a/a/w/n;->a()V

    goto :goto_0

    :cond_0
    const-string p1, "LogManager"

    const-string p2, "Permissions Denied by user not initialising Persistent Logs"

    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
