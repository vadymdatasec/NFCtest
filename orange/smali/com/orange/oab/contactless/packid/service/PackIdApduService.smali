.class public Lcom/orange/oab/contactless/packid/service/PackIdApduService;
.super Landroid/nfc/cardemulation/HostApduService;
.source "SourceFile"


# static fields
.field public static d:I = 0x7d0


# instance fields
.field public b:Le/h/d/a/a/w/m;

.field public c:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/nfc/cardemulation/HostApduService;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/orange/oab/contactless/packid/service/PackIdApduService;)V
    .locals 0

    invoke-direct {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->d()V

    return-void
.end method

.method private synthetic d()V
    .locals 2

    const-string v0, "autoDeactivate"

    const-string v1, "packid.nfc.ApduService"

    .line 1
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {v1, v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b()V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "DEACTIVATION_DESELECTED"

    return-object p1

    :cond_1
    const-string p1, "DEACTIVATION_LINK_LOSS"

    return-object p1
.end method

.method public final a()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->c:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->c:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v1, 0x1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "packid.nfc.ApduService"

    const-string v2, "Current thread has been interrupted, could not wait for auto deactivate executor termination"

    .line 5
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b:Le/h/d/a/a/w/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/h/d/a/a/w/m;->a()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b:Le/h/d/a/a/w/m;

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->a()V

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    new-instance v1, Le/h/d/a/a/w/b;

    invoke-direct {v1, p0}, Le/h/d/a/a/w/b;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdApduService;)V

    sget v2, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->d:I

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/nfc/cardemulation/HostApduService;->onCreate()V

    const-string v0, "packid.nfc.ApduService"

    const-string v1, "start service"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onDeactivated(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDeactivated because "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "packid.nfc.ApduService"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "onDeactivated"

    .line 2
    invoke-static {v0, p1}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->a()V

    .line 4
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/nfc/cardemulation/HostApduService;->onDestroy()V

    const-string v0, "packid.nfc.ApduService"

    const-string v1, "desstroy service"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public processCommandApdu([BLandroid/os/Bundle;)[B
    .locals 2

    .line 1
    new-instance p2, Le/h/d/a/a/o/a/q;

    const-string v0, "processCommandApdu"

    const/4 v1, 0x0

    invoke-direct {p2, p0, v0, v1}, Le/h/d/a/a/o/a/q;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    const-string v0, "NfcSession"

    invoke-virtual {p2, v0}, Le/h/d/a/a/o/a/q;->a(Ljava/lang/String;)Le/h/d/a/a/o/a/q;

    .line 2
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b:Le/h/d/a/a/w/m;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Le/h/d/a/a/w/m;

    invoke-direct {v0, p0}, Le/h/d/a/a/w/m;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b:Le/h/d/a/a/w/m;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b:Le/h/d/a/a/w/m;

    invoke-virtual {v0, p1}, Le/h/d/a/a/w/m;->a([B)[B

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->c()V

    .line 6
    invoke-virtual {p2}, Le/h/d/a/a/o/a/q;->a()V

    return-object p1
.end method
