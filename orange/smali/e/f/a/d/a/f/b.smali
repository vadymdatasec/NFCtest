.class public final Le/f/a/d/a/f/b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le/f/a/d/a/f/c;


# direct methods
.method public synthetic constructor <init>(Le/f/a/d/a/f/c;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/f/b;->a:Le/f/a/d/a/f/c;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/f/b;->a:Le/f/a/d/a/f/c;

    invoke-virtual {v0, p1, p2}, Le/f/a/d/a/f/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
