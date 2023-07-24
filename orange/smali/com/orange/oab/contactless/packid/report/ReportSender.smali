.class public Lcom/orange/oab/contactless/packid/report/ReportSender;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/orange/oab/contactless/packid/report/ReportSenderHandler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/h/d/a/a/u/a;

    invoke-direct {v0}, Le/h/d/a/a/u/a;-><init>()V

    sput-object v0, Lcom/orange/oab/contactless/packid/report/ReportSender;->a:Lcom/orange/oab/contactless/packid/report/ReportSenderHandler;

    return-void
.end method

.method public static init(Lcom/orange/oab/contactless/packid/report/ReportSenderHandler;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/orange/oab/contactless/packid/report/ReportSender;->a:Lcom/orange/oab/contactless/packid/report/ReportSenderHandler;

    return-void
.end method

.method public static send(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "packid.ReportSender"

    .line 1
    invoke-static {v0, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2
    sget-object v0, Lcom/orange/oab/contactless/packid/report/ReportSender;->a:Lcom/orange/oab/contactless/packid/report/ReportSenderHandler;

    invoke-interface {v0, p0, p1}, Lcom/orange/oab/contactless/packid/report/ReportSenderHandler;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
