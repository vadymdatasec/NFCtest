.class public Landroidx/preference/Preference;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/preference/Preference$b;,
        Landroidx/preference/Preference$d;,
        Landroidx/preference/Preference$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Landroidx/preference/Preference;",
        ">;"
    }
.end annotation


# instance fields
.field public b:Landroid/content/Context;

.field public c:Lc/q/b;

.field public d:Lc/q/a;

.field public e:Landroidx/preference/Preference$c;

.field public f:Landroidx/preference/Preference$d;

.field public g:I

.field public h:Ljava/lang/CharSequence;

.field public i:Ljava/lang/CharSequence;

.field public j:Ljava/lang/String;

.field public k:Landroid/content/Intent;

.field public l:Ljava/lang/String;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Ljava/lang/Object;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Landroidx/preference/Preference$b;

.field public u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/preference/Preference;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 37
    sget v0, Lc/q/c;->preferenceStyle:I

    const v1, 0x101008e

    invoke-static {p1, v0, v1}, Lc/h/f/i/t;->a(Landroid/content/Context;II)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 2
    iput v0, p0, Landroidx/preference/Preference;->g:I

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Landroidx/preference/Preference;->m:Z

    .line 4
    iput-boolean v1, p0, Landroidx/preference/Preference;->n:Z

    .line 5
    iput-boolean v1, p0, Landroidx/preference/Preference;->o:Z

    .line 6
    iput-boolean v1, p0, Landroidx/preference/Preference;->q:Z

    .line 7
    iput-boolean v1, p0, Landroidx/preference/Preference;->r:Z

    .line 8
    new-instance v2, Landroidx/preference/Preference$a;

    invoke-direct {v2, p0}, Landroidx/preference/Preference$a;-><init>(Landroidx/preference/Preference;)V

    .line 9
    iput-object p1, p0, Landroidx/preference/Preference;->b:Landroid/content/Context;

    .line 10
    sget-object v2, Lc/q/f;->Preference:[I

    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 11
    sget p2, Lc/q/f;->Preference_icon:I

    sget p3, Lc/q/f;->Preference_android_icon:I

    const/4 p4, 0x0

    invoke-static {p1, p2, p3, p4}, Lc/h/f/i/t;->b(Landroid/content/res/TypedArray;III)I

    .line 12
    sget p2, Lc/q/f;->Preference_key:I

    sget p3, Lc/q/f;->Preference_android_key:I

    invoke-static {p1, p2, p3}, Lc/h/f/i/t;->b(Landroid/content/res/TypedArray;II)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    .line 13
    sget p2, Lc/q/f;->Preference_title:I

    sget p3, Lc/q/f;->Preference_android_title:I

    invoke-static {p1, p2, p3}, Lc/h/f/i/t;->c(Landroid/content/res/TypedArray;II)Ljava/lang/CharSequence;

    move-result-object p2

    iput-object p2, p0, Landroidx/preference/Preference;->h:Ljava/lang/CharSequence;

    .line 14
    sget p2, Lc/q/f;->Preference_summary:I

    sget p3, Lc/q/f;->Preference_android_summary:I

    invoke-static {p1, p2, p3}, Lc/h/f/i/t;->c(Landroid/content/res/TypedArray;II)Ljava/lang/CharSequence;

    move-result-object p2

    iput-object p2, p0, Landroidx/preference/Preference;->i:Ljava/lang/CharSequence;

    .line 15
    sget p2, Lc/q/f;->Preference_order:I

    sget p3, Lc/q/f;->Preference_android_order:I

    invoke-static {p1, p2, p3, v0}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;III)I

    move-result p2

    iput p2, p0, Landroidx/preference/Preference;->g:I

    .line 16
    sget p2, Lc/q/f;->Preference_fragment:I

    sget p3, Lc/q/f;->Preference_android_fragment:I

    invoke-static {p1, p2, p3}, Lc/h/f/i/t;->b(Landroid/content/res/TypedArray;II)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Landroidx/preference/Preference;->l:Ljava/lang/String;

    .line 17
    sget p2, Lc/q/f;->Preference_layout:I

    sget p3, Lc/q/f;->Preference_android_layout:I

    sget v0, Lc/q/e;->preference:I

    invoke-static {p1, p2, p3, v0}, Lc/h/f/i/t;->b(Landroid/content/res/TypedArray;III)I

    .line 18
    sget p2, Lc/q/f;->Preference_widgetLayout:I

    sget p3, Lc/q/f;->Preference_android_widgetLayout:I

    invoke-static {p1, p2, p3, p4}, Lc/h/f/i/t;->b(Landroid/content/res/TypedArray;III)I

    .line 19
    sget p2, Lc/q/f;->Preference_enabled:I

    sget p3, Lc/q/f;->Preference_android_enabled:I

    invoke-static {p1, p2, p3, v1}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/preference/Preference;->m:Z

    .line 20
    sget p2, Lc/q/f;->Preference_selectable:I

    sget p3, Lc/q/f;->Preference_android_selectable:I

    invoke-static {p1, p2, p3, v1}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/preference/Preference;->n:Z

    .line 21
    sget p2, Lc/q/f;->Preference_persistent:I

    sget p3, Lc/q/f;->Preference_android_persistent:I

    invoke-static {p1, p2, p3, v1}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/preference/Preference;->o:Z

    .line 22
    sget p2, Lc/q/f;->Preference_dependency:I

    sget p3, Lc/q/f;->Preference_android_dependency:I

    invoke-static {p1, p2, p3}, Lc/h/f/i/t;->b(Landroid/content/res/TypedArray;II)Ljava/lang/String;

    .line 23
    sget p2, Lc/q/f;->Preference_allowDividerAbove:I

    iget-boolean p3, p0, Landroidx/preference/Preference;->n:Z

    invoke-static {p1, p2, p2, p3}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    .line 24
    sget p2, Lc/q/f;->Preference_allowDividerBelow:I

    iget-boolean p3, p0, Landroidx/preference/Preference;->n:Z

    invoke-static {p1, p2, p2, p3}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    .line 25
    sget p2, Lc/q/f;->Preference_defaultValue:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 26
    sget p2, Lc/q/f;->Preference_defaultValue:I

    invoke-virtual {p0, p1, p2}, Landroidx/preference/Preference;->a(Landroid/content/res/TypedArray;I)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Landroidx/preference/Preference;->p:Ljava/lang/Object;

    goto :goto_0

    .line 27
    :cond_0
    sget p2, Lc/q/f;->Preference_android_defaultValue:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 28
    sget p2, Lc/q/f;->Preference_android_defaultValue:I

    invoke-virtual {p0, p1, p2}, Landroidx/preference/Preference;->a(Landroid/content/res/TypedArray;I)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Landroidx/preference/Preference;->p:Ljava/lang/Object;

    .line 29
    :cond_1
    :goto_0
    sget p2, Lc/q/f;->Preference_shouldDisableView:I

    sget p3, Lc/q/f;->Preference_android_shouldDisableView:I

    .line 30
    invoke-static {p1, p2, p3, v1}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    .line 31
    sget p2, Lc/q/f;->Preference_singleLineTitle:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/preference/Preference;->s:Z

    if-eqz p2, :cond_2

    .line 32
    sget p2, Lc/q/f;->Preference_singleLineTitle:I

    sget p3, Lc/q/f;->Preference_android_singleLineTitle:I

    invoke-static {p1, p2, p3, v1}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    .line 33
    :cond_2
    sget p2, Lc/q/f;->Preference_iconSpaceReserved:I

    sget p3, Lc/q/f;->Preference_android_iconSpaceReserved:I

    invoke-static {p1, p2, p3, p4}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    .line 34
    sget p2, Lc/q/f;->Preference_isPreferenceVisible:I

    invoke-static {p1, p2, p2, v1}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;IIZ)Z

    .line 35
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 17
    invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return p1

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 19
    iget-object v1, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lc/q/a;->a(Ljava/lang/String;I)I

    move-result p1

    return p1

    .line 20
    :cond_1
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    invoke-virtual {v0}, Lc/q/b;->e()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public a(Landroidx/preference/Preference;)I
    .locals 2

    .line 4
    iget v0, p0, Landroidx/preference/Preference;->g:I

    iget v1, p1, Landroidx/preference/Preference;->g:I

    if-eq v0, v1, :cond_0

    sub-int/2addr v0, v1

    return v0

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/preference/Preference;->h:Ljava/lang/CharSequence;

    iget-object v1, p1, Landroidx/preference/Preference;->h:Ljava/lang/CharSequence;

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    if-nez v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    if-nez v1, :cond_3

    const/4 p1, -0x1

    return p1

    .line 6
    :cond_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Landroidx/preference/Preference;->h:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public a()Landroid/content/Context;
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/preference/Preference;->b:Landroid/content/Context;

    return-object v0
.end method

.method public a(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 13
    invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 15
    iget-object v1, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lc/q/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 16
    :cond_1
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    invoke-virtual {v0}, Lc/q/b;->e()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/SharedPreferences$Editor;)V
    .locals 1

    .line 11
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    invoke-virtual {v0}, Lc/q/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Landroidx/preference/Preference;->n()V

    return-void
.end method

.method public a(Landroidx/preference/Preference;Z)V
    .locals 0

    .line 7
    iget-boolean p1, p0, Landroidx/preference/Preference;->q:Z

    if-ne p1, p2, :cond_0

    xor-int/lit8 p1, p2, 0x1

    .line 8
    iput-boolean p1, p0, Landroidx/preference/Preference;->q:Z

    .line 9
    invoke-virtual {p0}, Landroidx/preference/Preference;->o()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->b(Z)V

    .line 10
    invoke-virtual {p0}, Landroidx/preference/Preference;->l()V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->e:Landroidx/preference/Preference$c;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0, p1}, Landroidx/preference/Preference$c;->a(Landroidx/preference/Preference;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public a(Z)Z
    .locals 2

    .line 21
    invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return p1

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 23
    iget-object v1, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lc/q/a;->a(Ljava/lang/String;Z)Z

    move-result p1

    return p1

    .line 24
    :cond_1
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    invoke-virtual {v0}, Lc/q/b;->e()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/lang/StringBuilder;
    .locals 4

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    invoke-virtual {p0}, Landroidx/preference/Preference;->h()Ljava/lang/CharSequence;

    move-result-object v1

    .line 24
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/16 v3, 0x20

    if-nez v2, :cond_0

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroidx/preference/Preference;->g()Ljava/lang/CharSequence;

    move-result-object v1

    .line 27
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_2
    return-object v0
.end method

.method public b(Landroidx/preference/Preference;Z)V
    .locals 0

    .line 4
    iget-boolean p1, p0, Landroidx/preference/Preference;->r:Z

    if-ne p1, p2, :cond_0

    xor-int/lit8 p1, p2, 0x1

    .line 5
    iput-boolean p1, p0, Landroidx/preference/Preference;->r:Z

    .line 6
    invoke-virtual {p0}, Landroidx/preference/Preference;->o()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->b(Z)V

    .line 7
    invoke-virtual {p0}, Landroidx/preference/Preference;->l()V

    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->u:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 3
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/preference/Preference;

    invoke-virtual {v3, p0, p1}, Landroidx/preference/Preference;->a(Landroidx/preference/Preference;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b(I)Z
    .locals 3

    .line 15
    invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    not-int v0, p1

    .line 16
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne p1, v0, :cond_1

    return v1

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 18
    iget-object v2, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Lc/q/a;->b(Ljava/lang/String;I)V

    goto :goto_0

    .line 19
    :cond_2
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    invoke-virtual {v0}, Lc/q/b;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 20
    iget-object v2, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 21
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Landroid/content/SharedPreferences$Editor;)V

    :goto_0
    return v1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 3

    .line 8
    invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    return v1

    .line 10
    :cond_1
    invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v2, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Lc/q/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    invoke-virtual {v0}, Lc/q/b;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 13
    iget-object v2, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 14
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Landroid/content/SharedPreferences$Editor;)V

    :goto_0
    return v1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->l:Ljava/lang/String;

    return-object v0
.end method

.method public c(Z)Z
    .locals 3

    .line 2
    invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    xor-int/lit8 v0, p1, 0x1

    .line 3
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Z)Z

    move-result v0

    const/4 v1, 0x1

    if-ne p1, v0, :cond_1

    return v1

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v2, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Lc/q/a;->b(Ljava/lang/String;Z)V

    goto :goto_0

    .line 6
    :cond_2
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    invoke-virtual {v0}, Lc/q/b;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 7
    iget-object v2, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 8
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Landroid/content/SharedPreferences$Editor;)V

    :goto_0
    return v1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroidx/preference/Preference;

    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->a(Landroidx/preference/Preference;)I

    move-result p1

    return p1
.end method

.method public d()Landroid/content/Intent;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->k:Landroid/content/Intent;

    return-object v0
.end method

.method public e()Lc/q/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->d:Lc/q/a;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lc/q/b;->d()Lc/q/a;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Lc/q/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    return-object v0
.end method

.method public g()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->i:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public h()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->h:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/preference/Preference;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/preference/Preference;->q:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/preference/Preference;->r:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/preference/Preference;->o:Z

    return v0
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->t:Landroidx/preference/Preference$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0}, Landroidx/preference/Preference$b;->a(Landroidx/preference/Preference;)V

    :cond_0
    return-void
.end method

.method public m()V
    .locals 0

    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/preference/Preference;->j()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/preference/Preference;->m()V

    .line 3
    iget-object v0, p0, Landroidx/preference/Preference;->f:Landroidx/preference/Preference$d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Landroidx/preference/Preference$d;->a(Landroidx/preference/Preference;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroidx/preference/Preference;->f()Lc/q/b;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lc/q/b;->c()Lc/q/b$b;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {v0, p0}, Lc/q/b$b;->a(Landroidx/preference/Preference;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Landroidx/preference/Preference;->k:Landroid/content/Intent;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Landroidx/preference/Preference;->a()Landroid/content/Context;

    move-result-object v0

    .line 9
    iget-object v1, p0, Landroidx/preference/Preference;->k:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_3
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/preference/Preference;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->c:Lc/q/b;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/preference/Preference;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/preference/Preference;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/preference/Preference;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
