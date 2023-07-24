.class public Lcom/orange/oab/contactless/packid/service/LogManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final GATT_LEVEL:I = 0x1

.field public static final MESSAGE_ACTION:Ljava/lang/String; = "LogService"

.field public static final MESSAGE_COLOR:Ljava/lang/String; = "LogServiceColor"

.field public static final MESSAGE_EXTRA:Ljava/lang/String; = "LogServiceMessage"

.field public static final MESSAGE_TIME_STAMP:Ljava/lang/String; = "LogServiceTimeStamp"

.field public static final SHOULD_WRITE:Ljava/lang/String; = "LogServiceShouldWrite"

.field public static final TAG:Ljava/lang/String; = "LogManager"

.field public static final TRANSACTION_LEVEL:I = 0x2

.field public static final a:[Ljava/lang/String;

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static e:Ljava/util/Date;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 1
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/orange/oab/contactless/packid/service/LogManager;->a:[Ljava/lang/String;

    const/16 v0, 0x87

    const/4 v1, 0x0

    const/16 v2, 0x57

    .line 2
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    sput v2, Lcom/orange/oab/contactless/packid/service/LogManager;->b:I

    const/16 v2, 0x21

    .line 3
    invoke-static {v1, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/orange/oab/contactless/packid/service/LogManager;->c:I

    const/16 v0, 0xe8

    const/16 v1, 0xa5

    const/16 v2, 0x40

    .line 4
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/orange/oab/contactless/packid/service/LogManager;->d:I

    return-void
.end method

.method public static a(II)I
    .locals 1

    const/high16 v0, -0x1000000

    if-ne p0, v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    if-ne p1, p0, :cond_1

    .line 14
    sget v0, Lcom/orange/oab/contactless/packid/service/LogManager;->b:I

    goto :goto_0

    :cond_1
    sget v0, Lcom/orange/oab/contactless/packid/service/LogManager;->c:I

    :goto_0
    return v0

    :cond_2
    return p0
.end method

.method public static a(ILjava/util/Date;)Ljava/lang/String;
    .locals 5

    if-lez p0, :cond_1

    .line 15
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0000"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/orange/oab/contactless/packid/service/LogManager;->e:Ljava/util/Date;

    if-nez v1, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    sget-object p1, Lcom/orange/oab/contactless/packid/service/LogManager;->e:Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    :goto_0
    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ms"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, " -- "

    return-object p0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Le/h/a/a/a/a/b;->c(Landroid/content/Context;Z)V

    .line 2
    new-instance v0, Le/h/d/a/a/w/j;

    invoke-direct {v0, p0}, Le/h/d/a/a/w/j;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-virtual {v0}, Le/h/d/a/a/w/j;->a()V

    return-void
.end method

.method public static a(Landroid/content/Context;Le/h/d/a/a/w/n;)V
    .locals 3

    .line 6
    new-instance v0, Lcom/orange/oab/contactless/packid/service/LogManager$a;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1, p1}, Lcom/orange/oab/contactless/packid/service/LogManager$a;-><init>(Landroid/os/Handler;Le/h/d/a/a/w/n;)V

    .line 7
    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/orange/oab/contactless/packid/permissions/PermissionActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "result_receiver"

    .line 8
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 9
    sget-object v0, Lcom/orange/oab/contactless/packid/service/LogManager;->a:[Ljava/lang/String;

    const-string v1, "permissions_array"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "request_code"

    const v1, 0x1e315

    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 11
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/w/j;Ljava/lang/String;Landroid/content/Context;Z)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Le/h/d/a/a/w/j;->a(Ljava/lang/String;Landroid/content/Context;Z)V

    const/4 p0, 0x0

    const/high16 p3, -0x1000000

    .line 5
    invoke-static {p2, p3, p1, p0, p0}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;IZ)V

    return-void
.end method

.method public static a(Ljava/io/File;)Z
    .locals 4

    .line 12
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x400

    .line 13
    div-long/2addr v0, v2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x1

    cmp-long p0, v0, v2

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static b(ILjava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "HH:mm:ss.SSS"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(ILjava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    if-lt p0, p1, :cond_0

    sub-int/2addr p0, p1

    const-string p1, " > "

    invoke-static {p1, p0}, Le/f/b/a/q;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    const/high16 v0, -0x10000

    .line 1
    invoke-static {p0, v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;I)V

    return-void
.end method

.method public static log(Landroid/content/Context;ILjava/lang/String;I)V
    .locals 3

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-string v1, "LogService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 5
    invoke-static {p3, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->b(ILjava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "LogServiceTimeStamp"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "LogServiceMessage"

    .line 6
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    invoke-static {p1, p3}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(II)I

    move-result p1

    const-string p2, "LogServiceColor"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "LogServiceShouldWrite"

    const/4 p2, 0x1

    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 9
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object p0

    invoke-virtual {p0, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public static log(Landroid/content/Context;ILjava/lang/String;IZ)V
    .locals 3

    .line 10
    new-instance v0, Landroid/content/Intent;

    const-string v1, "LogService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 11
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 12
    invoke-static {p3, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->b(ILjava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "LogServiceTimeStamp"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "LogServiceMessage"

    .line 13
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    invoke-static {p1, p3}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(II)I

    move-result p1

    const-string p2, "LogServiceColor"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "LogServiceShouldWrite"

    .line 15
    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 16
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object p0

    invoke-virtual {p0, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public static log(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public static log(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    const/high16 v0, -0x1000000

    .line 2
    invoke-static {p0, v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;I)V

    return-void
.end method

.method public static start(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    sput-object v0, Lcom/orange/oab/contactless/packid/service/LogManager;->e:Ljava/util/Date;

    .line 2
    invoke-static {p0, p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static startPersistentLog(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 2

    const-string v0, "LogManager"

    const-string v1, "Start Persistent Log"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Le/h/a/a/a/a/b;->c(Landroid/content/Context;Z)V

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 3
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance p1, Le/h/d/a/a/w/c;

    invoke-direct {p1, p0}, Le/h/d/a/a/w/c;-><init>(Landroid/content/Context;)V

    invoke-static {p0, p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(Landroid/content/Context;Le/h/d/a/a/w/n;)V

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Le/h/d/a/a/w/j;

    invoke-direct {v0, p0}, Le/h/d/a/a/w/j;-><init>(Landroid/content/Context;)V

    .line 6
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0, p0}, Le/h/d/a/a/w/j;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_2

    .line 7
    :cond_1
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(Landroid/content/Context;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static stopPersistentLogs(Landroid/content/Context;)V
    .locals 2

    const-string v0, "LogManager"

    const-string v1, "Stop Persistent Log"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Le/h/a/a/a/a/b;->c(Landroid/content/Context;Z)V

    return-void
.end method

.method public static w(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    .line 1
    sget v0, Lcom/orange/oab/contactless/packid/service/LogManager;->d:I

    invoke-static {p0, v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;I)V

    return-void
.end method

.method public static writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, p1, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public static writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 2

    .line 2
    invoke-static {p0}, Le/h/a/a/a/a/b;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    new-instance v0, Le/h/d/a/a/w/j;

    invoke-direct {v0, p0}, Le/h/d/a/a/w/j;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v0, p0}, Le/h/d/a/a/w/j;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(Landroid/content/Context;)V

    :cond_0
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 6
    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    new-instance v1, Le/h/d/a/a/w/a;

    invoke-direct {v1, v0, p1, p0, p2}, Le/h/d/a/a/w/a;-><init>(Le/h/d/a/a/w/j;Ljava/lang/String;Landroid/content/Context;Z)V

    invoke-static {p0, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(Landroid/content/Context;Le/h/d/a/a/w/n;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v0, p1, p0, p2}, Le/h/d/a/a/w/j;->a(Ljava/lang/String;Landroid/content/Context;Z)V

    const/high16 p2, -0x1000000

    const/4 v0, 0x0

    .line 9
    invoke-static {p0, p2, p1, v0, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;IZ)V

    goto :goto_0

    :cond_2
    const-string p0, "LogManager"

    const-string p1, "Persistent Logs are disabled should not write logs"

    .line 10
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static writeToPersistentLog(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 0

    .line 11
    invoke-static {p1}, Lm/a/a/c/f/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
