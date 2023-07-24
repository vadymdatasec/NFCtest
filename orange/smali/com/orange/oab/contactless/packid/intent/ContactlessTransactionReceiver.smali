.class public Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 2

    .line 21
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.SHOW_BADGE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "badge"

    .line 22
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x0

    const/high16 v1, 0x4000000

    .line 23
    invoke-static {p0, p1, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1, p2, p3, p4}, Le/h/d/a/a/q/i;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/Integer;Ljava/lang/String;)Le/h/d/a/a/q/c;

    move-result-object p3

    .line 2
    invoke-virtual {p0, p2}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    sget-object v0, Le/h/d/a/a/r/b;->i:Le/h/d/a/a/r/b;

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/b;->c(Landroid/content/Context;)V

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p3}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Landroid/content/Context;Le/h/d/a/a/q/c;)V

    .line 5
    invoke-virtual {p0, p2}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    invoke-virtual {p0, p1, p4, p5}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final a(Landroid/content/Context;Le/h/d/a/a/q/c;)V
    .locals 3

    .line 8
    sget-object v0, Le/h/d/a/a/r/b;->j:Le/h/d/a/a/r/b;

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/b;->f(Landroid/content/Context;)Lc/h/e/c0$a;

    move-result-object v0

    .line 9
    invoke-virtual {p2}, Le/h/d/a/a/q/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    .line 10
    invoke-virtual {p2}, Le/h/d/a/a/q/c;->e()[J

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/h/e/c0$a;->a([J)Lc/h/e/c0$a;

    .line 11
    invoke-virtual {p2}, Le/h/d/a/a/q/c;->d()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lc/h/e/c0$a;->a(J)Lc/h/e/c0$a;

    .line 12
    invoke-virtual {p2}, Le/h/d/a/a/q/c;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lc/h/e/c0$a;->a(I)Lc/h/e/c0$a;

    .line 13
    invoke-virtual {p2}, Le/h/d/a/a/q/c;->c()Le/h/d/a/a/q/c$a;

    move-result-object v1

    invoke-virtual {v1}, Le/h/d/a/a/q/c$a;->b()I

    move-result v1

    invoke-virtual {p2}, Le/h/d/a/a/q/c;->c()Le/h/d/a/a/q/c$a;

    move-result-object v2

    invoke-virtual {v2}, Le/h/d/a/a/q/c$a;->a()I

    move-result v2

    invoke-virtual {p2}, Le/h/d/a/a/q/c;->c()Le/h/d/a/a/q/c$a;

    move-result-object p2

    invoke-virtual {p2}, Le/h/d/a/a/q/c$a;->c()Z

    move-result p2

    invoke-virtual {v0, v1, v2, p2}, Lc/h/e/c0$a;->a(IIZ)Lc/h/e/c0$a;

    .line 14
    invoke-virtual {v0}, Lc/h/e/c0$a;->a()Landroid/app/Notification;

    move-result-object p2

    .line 15
    sget-object v0, Le/h/d/a/a/r/b;->j:Le/h/d/a/a/r/b;

    invoke-virtual {v0, p1, p2}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 16
    sget-object v0, Le/h/d/a/a/r/b;->i:Le/h/d/a/a/r/b;

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/b;->f(Landroid/content/Context;)Lc/h/e/c0$a;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p2}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    .line 18
    invoke-static {p1, p3}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object p2

    invoke-virtual {v0, p2}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    .line 19
    invoke-virtual {v0}, Lc/h/e/c0$a;->a()Landroid/app/Notification;

    move-result-object p2

    .line 20
    sget-object p3, Le/h/d/a/a/r/b;->i:Le/h/d/a/a/r/b;

    invoke-virtual {p3, p1, p2}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;)V

    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Z
    .locals 1

    .line 7
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->DONE:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string v0, "eventType"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const-string v0, "timeout"

    .line 2
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    const-string v0, "message"

    .line 3
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "badge"

    .line 4
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Receive contactless transaction event with type "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "packid.notif"

    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, p0

    move-object v2, p1

    .line 6
    invoke-virtual/range {v1 .. v6}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
