.class public Lc/i/a/a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/i/a/c;


# direct methods
.method public constructor <init>(Lc/i/a/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/i/a/a;->a:Lc/i/a/c;

    .line 2
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onChange(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/i/a/a;->a:Lc/i/a/c;

    invoke-virtual {p1}, Lc/i/a/c;->b()V

    return-void
.end method
