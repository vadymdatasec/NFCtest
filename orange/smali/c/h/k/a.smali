.class public Lc/h/k/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/h/k/p;

.field public final synthetic c:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Lc/h/k/c;Lc/h/k/p;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/h/k/a;->b:Lc/h/k/p;

    iput-object p3, p0, Lc/h/k/a;->c:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h/k/a;->b:Lc/h/k/p;

    iget-object v1, p0, Lc/h/k/a;->c:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lc/h/k/p;->a(Landroid/graphics/Typeface;)V

    return-void
.end method
