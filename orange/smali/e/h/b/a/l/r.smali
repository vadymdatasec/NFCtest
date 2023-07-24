.class public final synthetic Le/h/b/a/l/r;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic b:Le/h/b/a/l/y0;

.field private final synthetic c:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Le/h/b/a/l/y0;Landroid/content/SharedPreferences;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/r;->b:Le/h/b/a/l/y0;

    iput-object p2, p0, Le/h/b/a/l/r;->c:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Le/h/b/a/l/r;->b:Le/h/b/a/l/y0;

    iget-object v1, p0, Le/h/b/a/l/r;->c:Landroid/content/SharedPreferences;

    invoke-virtual {v0, v1, p1}, Le/h/b/a/l/y0;->a(Landroid/content/SharedPreferences;Landroid/view/View;)V

    return-void
.end method
