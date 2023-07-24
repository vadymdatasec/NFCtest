.class public Le/f/a/a/j/g0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/f/a/a/j/l0/a;

.field public final c:Le/f/a/a/j/l0/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/f/a/a/j/l0/a;Le/f/a/a/j/l0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/g0/m;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/g0/m;->b:Le/f/a/a/j/l0/a;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/g0/m;->c:Le/f/a/a/j/l0/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Le/f/a/a/j/g0/l;
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/a/a/j/g0/m;->a:Landroid/content/Context;

    iget-object v1, p0, Le/f/a/a/j/g0/m;->b:Le/f/a/a/j/l0/a;

    iget-object v2, p0, Le/f/a/a/j/g0/m;->c:Le/f/a/a/j/l0/a;

    invoke-static {v0, v1, v2, p1}, Le/f/a/a/j/g0/l;->a(Landroid/content/Context;Le/f/a/a/j/l0/a;Le/f/a/a/j/l0/a;Ljava/lang/String;)Le/f/a/a/j/g0/l;

    move-result-object p1

    return-object p1
.end method
