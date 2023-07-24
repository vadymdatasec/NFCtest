.class public final synthetic Le/h/b/a/l/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/c;->b:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Le/h/b/a/l/c;->b:Landroid/view/ViewGroup;

    invoke-static {v0, p1}, Le/h/b/a/l/v0;->a(Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method
