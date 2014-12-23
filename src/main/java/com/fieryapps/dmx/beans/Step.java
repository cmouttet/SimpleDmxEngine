/*
 * Copyright (c) 2014 Peter Dikant
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.fieryapps.dmx.beans;

import java.util.List;

/**
 * This bean stores the DMX values for a single step within a scene
 */
public class Step {
	
	// time to fade into this step in milliseconds
	private long fade;
	// time to hold this step
	private long hold;
	// list of values for all DMX addresses
	private List<Short> values;
	
	public long getFade() {
		return fade;
	}
	
	public void setFade(long fade) {
		this.fade = fade;
	}
	
	public long getHold() {
		return hold;
	}
	
	public void setHold(long hold) {
		this.hold = hold;
	}
	
	public List<Short> getValues() {
		return values;
	}
	
	public void setValues(List<Short> values) {
		this.values = values;
	}
}
