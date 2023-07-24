.class public Le/h/d/a/a/j/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public log(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 3
    invoke-static {p1, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public log(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/j/a;->log(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public log(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const/high16 v0, -0x1000000

    .line 2
    invoke-virtual {p0, p1, v0, p2, p3}, Le/h/d/a/a/j/a;->log(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method
