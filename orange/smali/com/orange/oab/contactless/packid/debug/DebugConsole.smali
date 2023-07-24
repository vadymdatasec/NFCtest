.class public Lcom/orange/oab/contactless/packid/debug/DebugConsole;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/orange/oab/contactless/packid/debug/DebugConsole;


# instance fields
.field public a:Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;-><init>()V

    sput-object v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->b:Lcom/orange/oab/contactless/packid/debug/DebugConsole;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/h/d/a/a/j/a;

    invoke-direct {v0}, Le/h/d/a/a/j/a;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->a:Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;

    return-void
.end method

.method public static initLogScreenPrinter(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->b:Lcom/orange/oab/contactless/packid/debug/DebugConsole;

    new-instance v1, Le/h/d/a/a/j/b;

    invoke-direct {v1, p0}, Le/h/d/a/a/j/b;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->a:Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;

    return-void
.end method

.method public static log(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 1

    .line 3
    sget-object v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->b:Lcom/orange/oab/contactless/packid/debug/DebugConsole;

    iget-object v0, v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->a:Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;->log(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method

.method public static log(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->b:Lcom/orange/oab/contactless/packid/debug/DebugConsole;

    iget-object v0, v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->a:Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;

    invoke-interface {v0, p0, p1}, Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static log(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 2
    sget-object v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->b:Lcom/orange/oab/contactless/packid/debug/DebugConsole;

    iget-object v0, v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->a:Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;

    invoke-interface {v0, p0, p1, p2}, Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;->log(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static resetLogScreenPrinter()V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->b:Lcom/orange/oab/contactless/packid/debug/DebugConsole;

    new-instance v1, Le/h/d/a/a/j/a;

    invoke-direct {v1}, Le/h/d/a/a/j/a;-><init>()V

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->a:Lcom/orange/oab/contactless/packid/debug/DebugConsolePrinter;

    return-void
.end method
