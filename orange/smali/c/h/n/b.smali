.class public final synthetic Lc/h/n/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnUnhandledKeyEventListener;


# instance fields
.field private final synthetic a:Lc/h/n/t0;


# direct methods
.method public synthetic constructor <init>(Lc/h/n/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/h/n/b;->a:Lc/h/n/t0;

    return-void
.end method


# virtual methods
.method public final onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lc/h/n/b;->a:Lc/h/n/t0;

    invoke-interface {v0, p1, p2}, Lc/h/n/t0;->onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
