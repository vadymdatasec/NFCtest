.class public final synthetic Le/h/b/a/n/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field private final synthetic b:Le/h/b/a/n/g;


# direct methods
.method public synthetic constructor <init>(Le/h/b/a/n/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/n/b;->b:Le/h/b/a/n/g;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Le/h/b/a/n/b;->b:Le/h/b/a/n/g;

    invoke-virtual {v0, p1}, Le/h/b/a/n/g;->a(Landroid/content/DialogInterface;)V

    return-void
.end method
