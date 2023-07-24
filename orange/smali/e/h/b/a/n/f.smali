.class public Le/h/b/a/n/f;
.super Le/h/b/a/n/c;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Le/h/b/a/n/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Le/h/b/a/n/f;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Le/h/b/a/l/y0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/h/b/a/n/c;-><init>(Le/h/b/a/l/y0;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string p1, "eventType"

    .line 1
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const-string p1, "zoneId"

    .line 2
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lfr/mbs/binary/Octets;

    const-string p1, "contactlessId"

    .line 3
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lfr/mbs/binary/Octets;

    const-string p1, "message"

    .line 4
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string p1, "timeout"

    .line 5
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Integer;

    const-string p1, "deviceName"

    .line 6
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    .line 7
    sget-object p1, Le/h/b/a/n/f;->b:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "received transaction event "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for contactlessId "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and zoneId "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-object v0, p0, Le/h/b/a/n/c;->a:Le/h/b/a/l/y0;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual/range {v0 .. v6}, Le/h/b/a/l/y0;->a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
