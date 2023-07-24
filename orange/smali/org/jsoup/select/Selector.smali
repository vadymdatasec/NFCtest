.class public Lorg/jsoup/select/Selector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jsoup/select/Selector$SelectorParseException;
    }
.end annotation


# instance fields
.field public final a:Lm/b/k/q0;

.field public final b:Lm/b/i/l;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm/b/i/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {p1}, Lm/b/h/j;->b(Ljava/lang/String;)V

    .line 5
    invoke-static {p2}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 6
    invoke-static {p1}, Lm/b/k/t0;->a(Ljava/lang/String;)Lm/b/k/q0;

    move-result-object p1

    iput-object p1, p0, Lorg/jsoup/select/Selector;->a:Lm/b/k/q0;

    .line 7
    iput-object p2, p0, Lorg/jsoup/select/Selector;->b:Lm/b/i/l;

    return-void
.end method

.method public static a(Ljava/lang/String;Lm/b/i/l;)Lm/b/k/f;
    .locals 1

    .line 1
    new-instance v0, Lorg/jsoup/select/Selector;

    invoke-direct {v0, p0, p1}, Lorg/jsoup/select/Selector;-><init>(Ljava/lang/String;Lm/b/i/l;)V

    invoke-virtual {v0}, Lorg/jsoup/select/Selector;->a()Lm/b/k/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lm/b/k/f;
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/jsoup/select/Selector;->a:Lm/b/k/q0;

    iget-object v1, p0, Lorg/jsoup/select/Selector;->b:Lm/b/i/l;

    invoke-static {v0, v1}, Lm/b/k/b;->a(Lm/b/k/q0;Lm/b/i/l;)Lm/b/k/f;

    move-result-object v0

    return-object v0
.end method
