.class public abstract Le/h/d/a/a/n/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Le/h/d/a/a/n/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/h/d/a/a/n/c;

    invoke-direct {v0}, Le/h/d/a/a/n/c;-><init>()V

    sput-object v0, Le/h/d/a/a/n/t;->a:Le/h/d/a/a/n/t;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/util/Date;
    .locals 1

    neg-int p0, p0

    const/16 v0, 0xe

    .line 1
    invoke-static {v0, p0}, Le/h/d/a/a/n/t;->a(II)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static a(II)Ljava/util/Date;
    .locals 2

    .line 2
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 3
    sget-object v1, Le/h/d/a/a/n/t;->a:Le/h/d/a/a/n/t;

    invoke-virtual {v1}, Le/h/d/a/a/n/t;->a()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setLenient(Z)V

    .line 5
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->add(II)V

    .line 6
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static b()Ljava/util/Date;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/n/t;->a:Le/h/d/a/a/n/t;

    invoke-virtual {v0}, Le/h/d/a/a/n/t;->a()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static b(I)Ljava/util/Date;
    .locals 1

    neg-int p0, p0

    const/16 v0, 0xd

    .line 2
    invoke-static {v0, p0}, Le/h/d/a/a/n/t;->a(II)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static c(I)Ljava/util/Date;
    .locals 1

    const/16 v0, 0xe

    .line 1
    invoke-static {v0, p0}, Le/h/d/a/a/n/t;->a(II)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a()Ljava/util/Date;
.end method
